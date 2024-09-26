import { DatePipe } from '@angular/common';
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { CrudService } from '../crud.service';
import { Emp } from '../emp';
@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  empForm: FormGroup;
  errorMessage: string;
  constructor(
    public fb: FormBuilder,
    public cService: CrudService,
    public datePipe: DatePipe,
    private router: Router
  ) {
  }

  ngOnInit(): void {
    this.empForm = this.fb.group({
      empid: ['', Validators.required],
      name: ['', Validators.required],
      salary: ['', Validators.required],
      dob: ['', Validators.required],
    })
  }
  submitForm() {
    /* let edob = this.datePipe.transform(this.empForm.get('dob').value, "dd-MMM-yyyy");
     let e: Emp = new Emp(this.empForm.get('empid').value,
       this.empForm.get('name').value, this.empForm.get('salary').value, edob);*/

    this.cService.create(this.empForm.value).subscribe(res => {
      this.router.navigate(['/employee/home/']);
    }, error => {
      this.errorMessage = error;
    });
  }
}

