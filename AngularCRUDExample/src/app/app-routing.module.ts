import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateComponent } from './employee/create/create.component';
import { HomeComponent } from './employee/home/home.component';
import { UpdateComponent } from './employee/update/update.component';

const routes: Routes = [
  { path: '', redirectTo: 'employee/home', pathMatch: 'full' },
  { path: 'employee/home', component: HomeComponent },
  { path: 'employee/create', component: CreateComponent },
  { path: 'employee/update/:empid', component: UpdateComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
