import { TestBed } from '@angular/core/testing';

import { MakeQuizService } from './make-quiz.service';

describe('MakeQuizService', () => {
  let service: MakeQuizService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MakeQuizService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
