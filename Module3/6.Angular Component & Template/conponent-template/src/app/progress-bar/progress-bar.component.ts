import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-progress-bar',
  templateUrl: './progress-bar.component.html',
  styleUrls: ['./progress-bar.component.css']
})
export class ProgressBarComponent implements OnInit {
  @Input() width: number;
  @Input() backgroundColor;
  @Input() progressColor;
  constructor() { }

  ngOnInit(): void {
  }

}
