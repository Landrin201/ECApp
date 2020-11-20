
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { StateAddServiceService } from '../shared/state-add-service.service';


@Component({
  selector: 'app-add-state-form',
  templateUrl: './add-state-form.component.html',
  styleUrls: ['./add-state-form.component.css']
})
export class AddStateFormComponent implements OnInit {

  constructor(private service: StateAddServiceService) {

  };


  ngOnInit() {
  }

onClear(){
  this.service.form.reset();
}

onSubmit(){
  if(this.service.form.valid){
    this.service.submitForm();
  } else{
    
  }

}

}
