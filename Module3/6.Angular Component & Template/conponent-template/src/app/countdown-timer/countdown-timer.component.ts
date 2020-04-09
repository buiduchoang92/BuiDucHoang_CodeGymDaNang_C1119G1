import { Component, OnInit, Input, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit {
  private interval ;
  message = '';
  thoigianconlai: number;
  @Input() seconds;
  ngOnInit() {
    this.reset();
  }
  clearTimer() {
    clearInterval(this.interval);
  }
  start() {
    this.countDown();
    if (this.thoigianconlai <= 0){
      this.thoigianconlai = this.seconds;
    }
  }
  reset() {
    this.clearTimer();
    this.thoigianconlai = this.seconds;
    this.message = 'bấm start để bắt đầu đếm';
  }
  stop() {
    this.clearTimer()
    this.message = `đang dừng tại ${this.thoigianconlai} bấm start để tiếp tục`;
  }
  countDown() {
    this.clearTimer();
    this.interval = setInterval(() => {
      this.thoigianconlai -= 1;
      if (this.thoigianconlai === 0) {
        this.message = 'đã đếm xong';
        this.clearTimer();
      }else {
        this.message = `thời gian còn lại ${this.thoigianconlai}`;
      }
    }, 1000);
  }
}
