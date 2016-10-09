<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap About Us Page Design</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<script>!function(e,a,t,n,c,o,s){e.GoogleAnalyticsObject=c,e[c]=e[c]||function(){(e[c].q=e[c].q||[]).push(arguments)},e[c].l=1*new Date,o=a.createElement(t),s=a.getElementsByTagName(t)[0],o.async=1,o.src=n,s.parentNode.insertBefore(o,s)}(window,document,"script","//www.google-analytics.com/analytics.js","ga"),ga("create","UA-47210639-2","auto"),ga("send","pageview")</script><script type=application/ld+json>{ "@context": "http://schema.org/","@type": "Review","itemReviewed": {"@type": "Thing","name": "Article"},"author": {"@type": "Person","name": "Md Ashraf Malik"}, "reviewRating": {"@type": "Rating","ratingValue": "5","bestRating": "5"}, "publisher": { "@type": "Organization", "name": "Web Developer Bareilly" } }</script>
<style>
body{font-family:'Open Sans Condensed',sans-serif;font-size:20px; background:#f8f8f8}
/* header */
html,body{height:100%; width:100%}
h1,h2,h3{font-weight:700}
header{position:relative; width:100%; background-size:cover; background-position:center; background-image:url(resources/images/header1.jpg); text-align:center}
header .wel{position: relative;text-align: center;padding: 100px 15px 100px;width: 100%; color:#eee}
.wel h1{font-weight:700; color:#fff}.brk{height:4px; border-radius:4px; background:#d9534f; margin:25px auto; display:block; width:60px}
.abs-back{background:rgba(29, 21, 24, 0.4); position:absolute; height:100%; width:100%; left:0; top:0}
/* who we */
.who-we{margin-top:50px; margin-bottom:50px}
.who-we h2{color:#d9534f;}
/* cards*/
.cards-row{padding-top:70px; padding-bottom:50px; background:#eee}
.thumbnail{padding:0; border-radius:0; border:none; box-shadow:0 2px 2px 0 rgba(0,0,0,.14),0 3px 1px -2px rgba(0,0,0,.2),0 1px 5px 0 rgba(0,0,0,.12)}
.thumbnail>img{width:100%; display:block}
.thumbnail h3{font-size:26px; color:#336}
.thumbnail h3,.card-description{margin:0; padding:8px 0; border-bottom:solid 1px #eee; text-align:center}
.thumbnail p{padding-top:8px; font-size:20px}
.thumbnail .btn{border-radius:0; box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12); font-size:20px}
.team-pic{height:150px !important; width:150px !important; border-radius:50%; margin-top:-75px; box-shadow:0 2px 5px 0 rgba(0,0,0,.4),0 2px 10px 0 rgba(0,0,0,.5); transition:all .2s ease-out}
.thumbnail:hover .team-pic{height:200px !important; width:200px !important; margin-top:-100px}
.thumbnail p.social{padding-top:15px; text-align:center}
.social a{color:#FFF; font-size:18px !important}
.social i.fa{height:36px; width:36px; text-align:center; line-height:36px; background:#069; border-radius:50%}
.social i.fa.fa-facebook{background:#43609C}
.social i.fa.fa-twitter{background:#2CA8D2}
.social i.fa.fa-linkedin{background:#428099}
.social i.fa.fa-google-plus{background:#ce4d39}

/* footer*/
#footer{background:#336; padding-top:30px; padding-bottom:30px; text-align:center; border-top:solid 4px #303}
#footer p{padding:10px; color:#fff}
.dont-remove{color:#fff !important; text-decoration:none !important; font-weight:700}
.rights{display:inline-block; border-top:solid 1px rgba(103, 58, 183, 0.3)}

/* media */
@media (min-width:768px) { 
header{ min-height: 100%} 
header .wel{position:absolute; top:50%; transform:translateY(-50%); -moz-transform:translateY(-50%); -webkit-transform: translateY(-50%); -ms-transform: translateY(-50%); padding: 0 50px;}
.wel-info{max-width:850px; margin-left:auto; margin-right:auto} .
who-we h2{font-size:42px} .wel h1{font-size:65px} header .wel{font-size:26px} 
}

</style>
</head>

<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">DIAMOND JEWELLARS</a>
			</div>
			<ul class="nav navbar-nav">
				<!-- <li class="active"><a href="CategoryList">Categories</a></li>-->
				<!-- <li class="active"><a href="#">Products</a></li>-->
				
				<li class="active"><a href="About_us">About Us</a></li>
				<li class="active"><a href="MainHome">Home</a></li>
			</ul>
		</div>
	</nav>


<body>

<header id="full">
<div class="abs-back"></div>
<div class="wel">
<div class="wel-info">

<h1>Diamond Jewellars</h1>
<span class="brk"></span>
<p>Beutiful collection of variety of jewellary</p>

</div>
</div>
</header>

<div class="container who-we">

<div class="wel-info text-center">

<h2>Who We Are?</h2>
<span class="brk"></span>
<p>We provide you jewellary to brighten your life</p>

</div>
</div>

<div class="container-fluid cards-row">
<div class="container">
<div class="row">

  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="resources/images/wall1.png" alt="">
       <img class="team-pic" src="resources/images/Female.png">
      <div class="caption">
        <h3>Mugdha</h3>
        <p class="card-description">Admin</p>
        <p class="social"><a href=""><i class="fa fa-facebook"></i></a> <a href=""><i class="fa fa-twitter"></i></a> <a href=""><i class="fa fa-linkedin"></i></a> <a href=""><i class="fa fa-google-plus"></i></a></p>
      </div>
    </div>
  </div>
  
    <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="resources/images/wall1.png" alt="">
        <img class="team-pic" src="resources/images/Female.png">
      <div class="caption">
        <h3>Riya</h3>
        <p class="card-description">sub admin</p>
        <p class="social"><a href=""><i class="fa fa-facebook"></i></a> <a href=""><i class="fa fa-twitter"></i></a> <a href=""><i class="fa fa-linkedin"></i></a> <a href=""><i class="fa fa-google-plus"></i></a></p>
      </div>
    </div>
  </div>
  
    <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="resources/images/wall1.png" alt="">
       <img class="team-pic" src="resources/images/Female.png">
      <div class="caption">
        <h3>Priya</h3>
        <p class="card-description">sub admin</p>
        <p class="social"><a href=""><i class="fa fa-facebook"></i></a> <a href=""><i class="fa fa-twitter"></i></a> <a href=""><i class="fa fa-linkedin"></i></a> <a href=""><i class="fa fa-google-plus"></i></a></p>
      </div>
    </div>
  </div>
  
</div>

</div>
</div>


<footer id="footer">
<div class="container">
        <p class="social"><a href=""><i class="fa fa-facebook"></i></a> <a href=""><i class="fa fa-twitter"></i></a> <a href=""><i class="fa fa-linkedin"></i></a> <a href=""><i class="fa fa-google-plus"></i></a></p>

<p class="rights">Copyright @2016 Diamond Jewellars. Designed By <!-- dont remove link --><a class="dont-remove" href="http://webdeveloperbareilly.in" target="_blank">Web Developer Mugdha</a></p>


</div>
</footer>

</body>
</html>l>