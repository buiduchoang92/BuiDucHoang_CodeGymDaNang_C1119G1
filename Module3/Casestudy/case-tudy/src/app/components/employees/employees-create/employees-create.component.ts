import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../../../services/employee.service';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
@Component({
  selector: 'app-employees-create',
  templateUrl: './employees-create.component.html',
  styleUrls: ['./employees-create.component.css']
})
export class EmployeesCreateComponent implements OnInit {
  public formAddNewEmployee: FormGroup ;
  constructor(private employeeService: EmployeeService, public formBuilder: FormBuilder, public router: Router) { }

  ngOnInit(): void {
   this.formAddNewEmployee = this.formBuilder.group({
      id: [],
     fullName: ['', [Validators.required, Validators.minLength(5)]],
     position: ['', [Validators.required]],
     part: ['', [Validators.required]],
     level: ['', [Validators.required]],
     birthday: ['', [Validators.required]],
     idCart: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
     salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
     phone: ['', [Validators.required, Validators.pattern('^(090|091|([\\(]84[\\)][\\+]90)|([\\(]84[\\)][\\+]91))[0-9]{7}$')]],
     email: ['', [Validators.required, Validators.email]],
     address: ['', [Validators.required]],

    });
  }
  addNewEmployee() {
    this.employeeService.postEmployee(this.formAddNewEmployee.value).subscribe(data => {
      this.router.navigateByUrl('employee-list');
      console.log(this.formAddNewEmployee);
    });
  }
}
