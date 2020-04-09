import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VoteForResultsComponent } from './vote-for-results.component';

describe('VoteForResultsComponent', () => {
  let component: VoteForResultsComponent;
  let fixture: ComponentFixture<VoteForResultsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VoteForResultsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VoteForResultsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
