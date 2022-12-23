import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccueilSalleComponent } from './accueil-salle.component';

describe('AccueilSalleComponent', () => {
  let component: AccueilSalleComponent;
  let fixture: ComponentFixture<AccueilSalleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AccueilSalleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AccueilSalleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
