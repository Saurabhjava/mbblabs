import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CrudService } from '../crud.service';
import { Emp } from '../emp';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  empid: number;
  emp: Emp;
  constructor(private cService: CrudService, private router: Router, private actRouter: ActivatedRoute) { }

  ngOnInit(): void {
    this.empid = this.actRouter.snapshot.params['empid'];
    this.emp = new Emp();
    this.cService.getById(this.empid).subscribe(data => {
      console.log(data);
      this.emp = data;
    }, error => console.log(error));
  }
  onSubmit() {
    console.log(this.emp.name);
    this.cService.update(this.emp).subscribe(res => {
      this.router.navigate(['/employee/home/']);
    }, error => {
      console.log(error);
    });
  }
}
