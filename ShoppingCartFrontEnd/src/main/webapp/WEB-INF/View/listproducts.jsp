<div class="container">
	<div class="row">

		<!-- To display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!-- To display actual products -->
		<div class="col-md-9">


			<!-- Added breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userclickallproducts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					>

					<c:if test="${userclickcategoryproducts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
					>

				</div>

			</div>
		</div>
	</div>
</div>