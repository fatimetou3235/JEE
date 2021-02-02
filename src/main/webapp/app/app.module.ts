import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { GesSchoolSharedModule } from 'app/shared/shared.module';
import { GesSchoolCoreModule } from 'app/core/core.module';
import { GesSchoolAppRoutingModule } from './app-routing.module';
import { GesSchoolHomeModule } from './home/home.module';
import { GesSchoolEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ActiveMenuDirective } from './layouts/navbar/active-menu.directive';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    GesSchoolSharedModule,
    GesSchoolCoreModule,
    GesSchoolHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    GesSchoolEntityModule,
    GesSchoolAppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, ActiveMenuDirective, FooterComponent],
  bootstrap: [MainComponent],
})
export class GesSchoolAppModule {}
