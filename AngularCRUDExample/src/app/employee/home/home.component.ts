import { Component, OnInit } from '@angular/core';
import { CrudService } from '../crud.service';
import { Emp } from '../emp';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  employees: Emp[] = [];
  constructor(private cService: CrudService) { }

  ngOnInit(): void {
    this.cService.getAll().subscribe((data: Emp[]) => {
      console.log(data);
      this.employees = data;
    })
  }
  deleteEmployee(empid) {
    this.cService.delete(empid).subscribe((data: Emp[]) => {
      console.log(data);
      this.employees = data;
    })
  }
}
