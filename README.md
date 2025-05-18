# java-app-jakarta-ee-webapp

# eMarket - Application Web Jakarta EE

Bienvenue sur **eMarket**, une application web développée avec **Jakarta EE** permettant la gestion et la vente de produits en ligne. Ce repo contient seulement la partie Jakarta. Pour connecter à une DB SQL, il faudra installer un serveur SQL sur son PC ( ou bien utiliser docker) puis initialiser la DB.

---

## Fonctionnalités principales

- **Ajout de produits** : Créez de nouveaux produits avec des informations telles que le nom, le prix.
- **Consultation** : Listez les produits existants.
- **Suppression** : Supprimez des produits du catalogue.
- **Ajout des produits au panier** : Ajoutez des produits au panier et gérez leur quantités.
- **Supprimer des produits du panier** : Supprimer les produits du panier

---

## 📌 Prérequis
Avant de commencer, assurez-vous d'avoir installé :

- **Java Development Kit (JDK) 21** : [Télécharger ici](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- **Apache NetBeans 25** : [Télécharger ici](https://netbeans.apache.org/)
- **GlassFish 7.0.22** : [Télécharger ici](https://glassfish.org/download)


## 🚀 Installation et Configuration

### 1 Cloner le projet
```sh
git clone git@github.com:sharmilant/java-app-jakarta-ee-webapp.git
cd java-app-jakarta-ee-webapp.git
```

### 2 Configurez la DB

```sh
cd eMarket/web/WEB-INF
nano glassfish-ressources.xml
```

Configurez ces champs avec les bonnes valeurs (url de la DB, user, mot de passe, database)
```
    <property name="URL" value="jdbc:derby://localhost:1527/eMarket"/>
    <property name="serverName" value="localhost"/>
    <property name="PortNumber" value="1527"/>
    <property name="DatabaseName" value="eMarket"/>
    <property name="User" value="app"/>
    <property name="Password" value="app"/>
```

### 3 Construisez l'application

```sh
mvn clean package
```

### 4 Déployez votre application avec votre serveur glassfish

Utilisez glassfish pour déployez votre application

### 5 Accédez à votre application

Copiez cet url :

```sh
http://localhost:8080/eMarket/index.xhtml
```


