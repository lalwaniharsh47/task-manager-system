import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app/app.component';

@NgModule({
  declarations: [AppComponent],  // AppComponent should be declared here
  imports: [BrowserModule, RouterModule.forRoot([])],  // Import required modules
  providers: [],
  bootstrap: [AppComponent]  // Ensure AppComponent is bootstrapped
})
export class AppModule {}
