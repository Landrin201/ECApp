import { TestBed } from '@angular/core/testing';

import { StateAddServiceService } from './state-add-service.service';

describe('StateAddServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StateAddServiceService = TestBed.get(StateAddServiceService);
    expect(service).toBeTruthy();
  });
});
