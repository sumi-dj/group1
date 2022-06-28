import { TestBed } from '@angular/core/testing';

import { DeliveryPartnerService } from './delivery-partner.service';

describe('DeliveryPartnerService', () => {
  let service: DeliveryPartnerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DeliveryPartnerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
