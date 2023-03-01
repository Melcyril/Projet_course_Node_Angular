import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appCourseBorderCard]'
})

export class BorderCardDirective {
private defaultColor:string="#E2E2E2";
private activeColor:string="#2D7CFF";

  constructor(private el: ElementRef) {
    this.setBorderColor(this.defaultColor);
  }
  @HostListener('mouseenter')
  onMouseEnter(){
    this.setBorderColor(this.activeColor);
  }
  @HostListener('mouseleave')
  onMouseLeave(){
    this.setBorderColor(this.defaultColor);
  }
  setBorderColor(color:string){
    let card=this.el.nativeElement.style.borderColor=`${color}`;
  }
}
//box-shadow-card