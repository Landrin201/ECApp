import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { FormGroup, FormControl, Validators } from "@angular/forms";
import { StateModel } from '../models/stateModel';


@Injectable({
  providedIn: 'root'
})
export class StateAddServiceService {

  constructor(private httpClient: HttpClient) { }

  form: FormGroup = new FormGroup({
    stateName: new FormControl('', [Validators.required]),
    stateAbbreviation: new FormControl('', [Validators.required, Validators.maxLength(2), Validators.minLength(2), Validators.pattern('^[A-Z]*$')]),
    yearStateAddedToUs: new FormControl('', [Validators.required, Validators.maxLength(4), Validators.minLength(4), Validators.pattern("^[0-9]*$")]),
    currentPopulationEstimate: new FormControl('', [Validators.required, Validators.maxLength(8), Validators.pattern("^[0-9]*$")])
  });

  submitForm() {
    let stateName = this.form.controls.stateName.value;
    let stateAbbr = this.form.controls.stateAbbreviation.value;
    let yearIncorporated = this.form.controls.yearStateAddedToUs.value;
    let currentPopulation = this.form.controls.currentPopulationEstimate.value;
    let url = 'http://localhost:3000/State/newState';
    //Submit to HTTP Endpoint, for now just print
    console.log("Values: ");
    console.log("State Name: " + stateName);
    console.log("stateAbbr: " + stateAbbr);
    console.log("Year Incorporated: " + yearIncorporated);
    console.log("Current Population: " + currentPopulation);

    let result: StateModel = Object.assign({}, this.form.value);
    console.log(result);
    console.log(JSON.stringify(result));

    const headerDict = {
      'Content-Type': 'application/json',
      'Accept': 'application/json',
      'Access-Control-Request-Headers': 'access-control-allow-credentials,access-control-allow-origin,content-type',
      'Access-Control-Allow-Origin':'*'
    }
    
    const requestOptions = {                                                                                                                                                                                 
      headers: new HttpHeaders(headerDict) 
    };

    return this.httpClient.post(url, JSON.stringify(result), requestOptions).subscribe( data => {
      console.log(data);
    });
  }
}
