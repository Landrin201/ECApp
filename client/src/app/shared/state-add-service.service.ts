import { Injectable } from '@angular/core';
import { FormGroup, FormControl, Validators } from "@angular/forms";

@Injectable({
  providedIn: 'root'
})
export class StateAddServiceService {

  constructor() { }

  form: FormGroup = new FormGroup({
    stateName: new FormControl('', [Validators.required]),
    stateAbbreviation: new FormControl('', [Validators.required, Validators.maxLength(2), Validators.minLength(2), Validators.pattern('^[A-Z]*$')]),
    yearIncorporated: new FormControl('', [Validators.required, Validators.maxLength(4), Validators.minLength(4), Validators.pattern("^[0-9]*$")]),
    currentPopulation: new FormControl('', [Validators.required, Validators.maxLength(8), Validators.pattern("^[0-9]*$")])
  });

  submitForm(){
    let stateName = this.form.controls.stateName.value;
    let stateAbbr = this.form.controls.stateAbbreviation.value;
    let yearIncorporated = this.form.controls.yearIncorporated.value;
    let currentPopulation = this.form.controls.yearIncorporated.value;

    //Submit to HTTP Endpoint, for now just print
    console.log("Values: " + stateName + " " + stateAbbr + " " + yearIncorporated + " " + currentPopulation);
  }


}
