import { Component, OnInit } from '@angular/core';
import { DateUntillService} from '../date-untill.service';

@Component({
  selector: 'app-time-lines',
  templateUrl: './time-lines.component.html',
  styleUrls: ['./time-lines.component.css']

})
export class TimeLinesComponent implements OnInit {
  output = '';
  constructor(private dateUntillService: DateUntillService) { }

  ngOnInit(): void {
  }
  onchange(value) {
    this.output = this.dateUntillService.getDiffToNow(value);
  }
}
