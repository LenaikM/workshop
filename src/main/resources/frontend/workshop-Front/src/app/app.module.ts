import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {UserServiceService} from "./user-service.service";
import { AccueilSalleComponent } from './accueil-salle/accueil-salle.component';
import { AbonnementSalleComponent } from './abonnement-salle/abonnement-salle.component';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    AccueilSalleComponent,
    AbonnementSalleComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule
    ],
  providers: [UserServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
