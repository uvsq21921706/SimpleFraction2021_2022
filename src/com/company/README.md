1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > Répondre ici
    Si on coche une case il va faire automatiquement le premier commit sur le git. 

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    $ git config --global user.name "uvsq21921706"
	$ git config --global user.email "aouchichesalah1999@gmail.com"
    ```
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    $ git init
    $ git remote add origin https://github.com/uvsq21921706/SimpleFraction2021_2022.git
    $ git push origin master
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    $ git add Fraction.java
    $ git add Main.java
    $ git commit -m "Ajout ..."
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    $ git add Fraction.java
    $ git add Main.java
    $ git commit -m "Ajout ..."
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    $ git push origin master
    "mail"
    "jeton"
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > Répondre ici
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    $ git pull origin master
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    *.class
	*.o
	*.a
	target/
	aout/
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    .idea
	*.iws
	*.iml
	*.ipr
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    
    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Expliquez la procédure de façon synthétique





1. Quel OS et quel shell de commande utilisez-vous ?
    > Répondre ici 
    Ubuntu(Linux)
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    # cat /etc/issue
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        # Répondre ici
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        # Répondre ici
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        # Répondre ici
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        # Répondre ici
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        # Répondre ici
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        # Répondre ici
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Répondre ici
    * `screen`/`tmux`
        > Répondre ici
    * `curl`/[HTTPie](https://httpie.org/)
        > Répondre ici
    * [jq](https://stedolan.github.io/jq/)
        > Répondre ici

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > Répondre ici

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Répondre ici
1. Comment choisir le JDK à utiliser dans un projet ?
    > Répondre ici
1. Comment préciser la version Java des sources dans un projet ?
    > Répondre ici
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Répondre ici
1. Comment reformater un fichier source Java ?
    > Répondre ici
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Répondre ici
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Répondre ici
1. Comment renommer une classe dans l'ensemble du projet ?
    > Répondre ici
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Répondre ici
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Répondre ici
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Répondre ici