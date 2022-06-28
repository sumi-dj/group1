import { TestBed } from '@angular/core/testing';

import { AdminCarService } from './admin-car.service';

describe('AdminCarService', () => {
  let service: AdminCarService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminCarService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
