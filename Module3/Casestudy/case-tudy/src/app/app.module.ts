import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomersComponent } from './components/customers/customers.component';
import { CustomersListComponent } from './components/customers/customers-list/customers-list.component';
import { CustomersEditComponent } from './components/customers/customers-edit/customers-edit.component';
import { DeleteComponent } from './components/customers/delete/delete.component';
import { CustomerCreateComponent } from './components/customers/customer-create/customer-create.component';
import { MatConfirmDialogComponent } from './mat-confirm-dialog/mat-confirm-dialog.component';


@NgModule({
  declarations: [
    AppComponent,
    CustomersComponent,
    CustomersListComponent,
    CustomersEditComponent,
    DeleteComponent,
    CustomerCreateComponent,
    MatConfirmDialogComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
