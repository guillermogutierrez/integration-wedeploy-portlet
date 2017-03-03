<%@ include file="./init.jsp" %>

<ul id="wedeploy-activities" class="timeline">
	<c:forEach items="${activities}" var="activity">
		<li class="timeline-item">
			<div class="panel panel-default">
				<div class="panel-heading" role="tab">
					<div class="timeline-increment-label">
						${activity.date}
					</div>
					<div class="h4 panel-title">
						<span>${activity.log}</span>
					</div>
					<div class="timeline-increment-icon">
						<div class="user-icon user-icon-danger">
							<span>${activity.user}</span>
						</div>
					</div>
				</div>
			</div>
		</li>
	</c:forEach>
</ul>