import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { EmployeesComponent } from './components/employees/employees-list/employees.component';
import { PipesComponent } from './pipes/pipes.component';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { EmployeesCreateComponent } from './components/employees/employees-create/employees-create.component';
import { EmployeesEditComponent } from './components/employees/employees-edit/employees-edit.component';
import { EmployeesDeleteComponent } from './components/employees/employees-delete/employees-delete.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatConfirmDialogComponent} from "./mat-confirm-dialog/mat-confirm-dialog.component";



const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'employee-list', component: EmployeesComponent},
  {path: 'employee-create', component: EmployeesCreateComponent},
  {path: 'employee-edit', component: EmployeesEditComponent},
  {path: 'employee-delete', component: EmployeesDeleteComponent},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [CommonModule,
    RouterModule.forRoot(routes),
    Ng2SearchPipeModule,
    FormsModule, ReactiveFormsModule,
  ],
  exports: [RouterModule],
  entryComponents:[MatConfirmDialogComponent],
  declarations: [EmployeesComponent,
    PipesComponent,
    HomeComponent,
    PageNotFoundComponent,
    EmployeesCreateComponent,
    EmployeesEditComponent,
    EmployeesDeleteComponent,
  ]
})
export class AppRoutingModule { }
