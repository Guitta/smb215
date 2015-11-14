# smb215
L'application web "GestionDesBiens" gère les biens d'une société ou d'une organisation, le CNAM par exemple.
L'application est sécurisée par une application déployée par Glassfish et basée sur les domaines (Realms) type FORM, et l'authentification j_security_check.
Des services web (RESTful Web Services) sont créés et à partir de ces services les opérations du CRUD sont programmées pour accéder aux différentes tables de la base de données à partir des services web et non pas des entités (Pages from entity classes).
Les rapports sont générés en pdf en utilisant le "jspdf" plugin.
Un QRCode est généré par item, pour référencer un item unique.
Cette application traite la traçabilité interne et externe, la ou les places de chaque item est visible pour l'administrateur/utilisateur du système:
    - Centre, salle, personnel, ... 
    - En cas de transport où est la personne qui le transporte actuellement (tracking)...

Pour pouvoir accomplir la traçabilité externe 2 autres applications android ont été développées : 
    - La première application, "SetLocation" pour envoyer les coordonnées GPS, latitude et longitude, d'un téléphone android et les sauvegarder dans l'application créée sous parse.com en vue de la partager avec l'application web "GestionDesBiens" pour positionner l'item sur une carte géographique (maplocation.html) et avec l'application mobile "MyMap".
    - La deuxième application, "MyMap" pour positionner l'item sur une carte géographique (map) sur le mobile en se servant des coordonnées déjà enregistrées sous parse.com.
