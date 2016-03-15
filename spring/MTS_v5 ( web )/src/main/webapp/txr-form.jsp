<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mts</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container">
			<a href="" class="navbar-brand">Txr-app</a>
			<ul class="nav navbar-nav">
				<li><a href><span class="glyphicon glyphicon-home"></span>Home</a></li>
				<li><a href="txr"> <span class="glyphicon glyphicon-transfer"></span> Txr</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		
		<div class="row">
			
			<div class="col-md-5">
			
				<form action="txr" method="post">
				
					<div class="form-group">
						<label>From</label>
						<input type="text" name="fromAccNum" class="form-control">
					</div>
					<div class="form-group">
						<label>To</label>
						<input type="text" name="toAccNum" class="form-control">
					</div>
					<div class="form-group">
						<label>Amount</label>
						<input type="number" name="amount" class="form-control">
					</div>
					<button type="submit" class="btn btn-primary">Txr</button>
				
				</form>
				
			</div>
		</div>
		
	</div>

</body>
</html>