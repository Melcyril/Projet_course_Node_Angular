import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-page-not-found',
  template: `
    <div class="container text-center mt-5">
        <div class="bg-secondary p-3 rounded">
          <h1 class="mb-3">Oops, la page n'a pas été trouvé !</h1>
          <p>La page que vous avez demandé n'existe pas, veuillez retourner sur la page 
            d'accueil en cliquant sur le bouton suivant :</p>
          <a class="btn btn-warning" routerLink="/courses">Retour à l'accueil</a>
        </div>
    </div>
  `,
  styles: [
  ]
})
export class PageNotFoundComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
