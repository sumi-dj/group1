import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeliveryPartnerComponent } from './delivery-partner.component';

describe('DeliveryPartnerComponent', () => {
  let component: DeliveryPartnerComponent;
  let fixture: ComponentFixture<DeliveryPartnerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeliveryPartnerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeliveryPartnerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
