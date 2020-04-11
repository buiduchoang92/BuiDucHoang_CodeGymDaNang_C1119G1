import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../../services/employee.service';
import { DialogService } from '../../../services/dialog/dialog.service'

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {
  public employees;
  term: string;
  p = 1;
  constructor(
    public employeeService: EmployeeService,
    public dialogService: DialogService
  ) { }

  ngOnInit(): void {
    this.employeeService.getAllEmployee().subscribe(data => {
      this.employees = data;
      console.log(this.employees);
    } );
  }

  onDelete(id: number) {
  //   this.employeeService.deleteEmployee(id).subscribe(data =>
  //   {
  //     this.updateData(id);
  //   })
  // }
  // updateData(id) {
  //   for (let i = 0; i < this.employees.length; i++) {
  //     if (this.employees[i].id==id) {
  //       this.employees.splice(i,1);
  //       break;
  //     }
  //   }
  this.dialogService.openConfirmDialog()
  }
}
