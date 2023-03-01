import { Directive , ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appBoxShadowCard]'
})
export class BoxShadowCardDirective {
  private defaultShadow:string=" 0px 0px 0px 0px";
  private activeShadow:string="10px 20px 30px blue";
  constructor(private el: ElementRef) {
    this.setBorderShadow(this.defaultShadow);
   }
  @HostListener('mouseenter')
  onMouseEnter(){
    this.setBorderShadow(this.activeShadow);
  }
  @HostListener('mouseleave')
  onMouseLeave(){
    this.setBorderShadow(this.defaultShadow);
  }
  setBorderShadow(shadow:string){
    let card=this.el.nativeElement.style.boxShadow=`${shadow}`;
  }
  setBoxShadow(){
    
  }
}
