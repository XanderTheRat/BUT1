<?php
   // Vérifier si le formulaire est soumis 
   if ( isset( $_GET['submit'] ) ) {
     /* récupérer les données du formulaire en utilisant 
        la valeur des attributs name comme clé 
       */
     $nom = $_GET['nom']; 
     $password = $_GET['password'];
     $sexe = $_GET['sexe'];
	 $improve = $_GET['improve'];
	 $opinion = $_GET['opinion'];
     // afficher le résultat
	 echo '<h2>Bravo, tu as réussi à envoyer des données de ton formulaire !</h2>'.'<br>';
     echo '<h3>Informations récupérées en utilisant GET</h3>'; 
     echo 'Nom : ' . $nom .'<br>'. ' Mot de passe : ' . $password .'<br>'. ' Sexe : ' . $sexe; 
	 echo '<br>'.'Tes propositions pour améliorer le site : ' . $improve . '<br>'.' Ton niveau de satisfaction : ' . $opinion;
	 if ( isset( $_GET['French']) ) {
		 echo '<br>'.'Tu aimes le français. ';
		}else{echo '<br>'.'Tu n\'aimes pas le français. ';}
	 if ( isset( $_GET['English']) ) {
		 echo '<br>'.'Tu aimes l\'anglais. ';
		}else{echo '<br>'.'Tu n\'aimes pas l\'anglais. ';}	
	 if ( isset( $_GET['German']) ) {
		 echo '<br>'.'Tu aimes l\'allemand. ';
		}else{echo '<br>'.'Tu n\'aimes pas l\'allemand. ';}
	 
     exit;
  }
?>