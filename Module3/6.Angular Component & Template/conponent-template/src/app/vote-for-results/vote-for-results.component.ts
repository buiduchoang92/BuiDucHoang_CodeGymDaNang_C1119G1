import { Component, OnInit, Input, Output, EventEmitter, OnChanges, SimpleChanges} from '@angular/core';
interface IRatingUnit {
  value: number;
  active: boolean;
}
@Component({
  selector: 'app-vote-for-results',
  templateUrl: './vote-for-results.component.html',
  styleUrls: ['./vote-for-results.component.css']
})
export class VoteForResultsComponent implements OnInit {
  constructor() { }
  @Input() ratingValue ;
  @Input() max = 5;
  showRatingValue = false;
  @Output()
  rateChange = new EventEmitter<number>();
  ratingUnits: Array<IRatingUnit> = [];
  onRateChange(event) {this.rateChange.emit(event.taget.value); }
  // tslint:disable-next-line:use-lifecycle-interface
  ngOnChanges(changes: SimpleChanges) {
    if ('max' in changes) {
      let max = changes.max.currentValue;
      max = typeof max === 'undefined' ? 5 : max;
      this.max = max;
      this.calculate(max, this.ratingValue);
    }
  }

  calculate(max, ratingValue) {
    this.ratingUnits = Array.from({length: max},
      (_, index) => ({
        value: index + 1,
        active: index < ratingValue
      }));
  }

  ngOnInit() {
    this.calculate(this.max, this.ratingValue);
  }

  select(index) {
    this.ratingValue = index + 1;
    this.ratingUnits.forEach((item, idx) => item.active = idx < this.ratingValue);
    this.rateChange.emit(this.ratingValue);
  }

  enter(index) {
    this.ratingUnits.forEach((item, idx) => item.active = idx <= index);
  }

  reset() {
    this.ratingUnits.forEach((item, idx) => item.active = idx < this.ratingValue);
  }

}
