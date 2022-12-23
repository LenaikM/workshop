import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AbonnementSalleComponent } from './abonnement-salle.component';

describe('AbonnementSalleComponent', () => {
  let component: AbonnementSalleComponent;
  let fixture: ComponentFixture<AbonnementSalleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AbonnementSalleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AbonnementSalleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
