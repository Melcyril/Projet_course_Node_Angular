import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'courseDisciplineColor'
})
export class CourseDisciplineColorPipe implements PipeTransform {

  transform(color:string): string {
    let className:string;
    switch(color){
      case "Developpement":
        className="primary";
        break;
      case "Gestion de Projet":
          className="warning";
        break;
      default:
        className="light";
        break;
    }
    return`badge text-bg-${className}`;
  }

}
