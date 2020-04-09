import { TestBed } from '@angular/core/testing';

import { DateUntillService } from './date-untill.service';

describe('DateUntillService', () => {
  let service: DateUntillService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DateUntillService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
