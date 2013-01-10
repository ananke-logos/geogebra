package geogebra.common.kernel.algos;
import geogebra.common.kernel.commands.Commands;
public enum Algos implements GetCommand{

	AlgoAngularBisector(Commands.AngularBisector),
	AlgoAngularBisectorLines(Commands.AngularBisector),
	AlgoAngularBisectorPoints(Commands.AngularBisector),
	AlgoCirclePointRadius(Commands.Circle),
	AlgoCircleThreePoints(Commands.Circle),
	AlgoCircleTwoPoints(Commands.Circle),
	AlgoConicFivePoints(Commands.Conic),
	AlgoConicArc(Commands.Arc),
	AlgoConicSector(Commands.Sector),
	AlgoCircleArc(Commands.CircleArc),
	AlgoCircleSector(Commands.CircleSector),
	AlgoCircumcircleArc(Commands.CircumcircleArc),
	AlgoCircumcircleSector(Commands.CircumcircleSector),
	AlgoCurveCartesian(Commands.CurveCartesian),
	AlgoDerivative(Commands.Derivative),
	AlgoDiameterLine(Commands.Diameter),
	AlgoDiameterVector(Commands.Diameter),
	AlgoEllipseFociLength(Commands.Ellipse),
	AlgoEllipseFociPoint(Commands.Ellipse),
	AlgoFunctionInterval(Commands.Function),
	AlgoHyperbolaFociLength(Commands.Hyperbola),
	AlgoHyperbolaFociPoint(Commands.Hyperbola),
	AlgoIntegral(Commands.Integral),
	AlgoIntegralDefinite(Commands.Integral),
	AlgoIntersectConics(Commands.Intersect),
	AlgoIntersectCS1D1D(Commands.Intersect),
	AlgoIntersectCS1D2D(Commands.Intersect),
	AlgoIntersectCS2D2D(Commands.IntersectionPaths),
	AlgoIntersectFunctionLineNewton(Commands.Intersect),
	AlgoIntersectFunctionsNewton(Commands.Intersect),
	AlgoIntersectLineConic(Commands.Intersect),
	AlgoIntersectLineConic3D(Commands.Intersect),
	AlgoIntersectLineConicRegion(Commands.IntersectionPaths),
	AlgoIntersectLines(Commands.Intersect),
	AlgoIntersectLinePolyLine(Commands.Intersect),
	AlgoIntersectLineCurve(Commands.Intersect),
	AlgoIntersectLinePolygon(Commands.Intersect),
	AlgoIntersectLinePolygon3D(Commands.Intersect),
	AlgoIntersectLinePolygonalRegion(Commands.IntersectionPaths),
	AlgoIntersectLinePolygonalRegion3D(Commands.IntersectionPaths),
	AlgoIntersectPathLinePolygon(Commands.IntersectPath),
	AlgoIntersectPathLinePolygon3D(Commands.IntersectPath),
	AlgoIntersectPathPlanePolygon3D(Commands.IntersectPath),
	AlgoIntersectLineQuadric3D(Commands.Intersect),
	AlgoIntersectPlaneConic(Commands.Intersect),
	AlgoIntersectPlanePolygon(Commands.Intersect),
	AlgoIntersectPlanePolyhedron(Commands.Intersect),
	AlgoIntersectPlanePolygonalRegion(Commands.IntersectionPaths),
	AlgoIntersectPolynomialLine(Commands.Intersect),
	AlgoIntersectPolynomials(Commands.Intersect),
	AlgoIntersectSingle(Commands.Intersect),
	AlgoIntersectSingle3D(Commands.Intersect),
	AlgoIntersectPolynomialConic(Commands.Intersect),
	AlgoIntersectImplicitpolyParametric(Commands.Intersect),
	AlgoIntersectFunctions(Commands.Intersect),
	AlgoIntersectImplicitpolys(Commands.Intersect),
	AlgoImageCorner(Commands.Corner),
	AlgoImplicitPolyThroughPoints(Commands.ImplicitCurve),
	AlgoImplicitPolyFunction(Commands.ImplicitCurve),
	AlgoTextCorner(Commands.Corner),
	AlgoDrawingPadCorner(Commands.Corner),
	AlgoJoinPoints(Commands.Line),
	AlgoJoinPointsRay(Commands.Ray),
	AlgoJoinPointsSegment(Commands.Segment),
	AlgoLineBisector(Commands.LineBisector),
	AlgoLineBisectorSegment(Commands.LineBisector),
	AlgoLinePointLine(Commands.Line),
	AlgoLinePointVector(Commands.Line),
	AlgoLocus(Commands.Locus),
	AlgoLocusSlider(Commands.Locus),
	AlgoMidpoint(Commands.Midpoint),
	AlgoMidpointSegment(Commands.Midpoint),
	AlgoOrthoLinePointLine(Commands.OrthogonalLine),
	AlgoOrthoLinePointLine3D(Commands.OrthogonalLine),
	AlgoOrthoLinePointVector(Commands.OrthogonalLine),
	AlgoOrthoVectorLine(Commands.OrthogonalVector),
	AlgoOrthoVectorVector(Commands.OrthogonalVector),
	AlgoParabolaParameter(Commands.Parameter),
	AlgoParabolaPointLine(Commands.Parabola),
	AlgoPointOnPath(Commands.Point),
	AlgoPointVector(Commands.Point),
	AlgoPolarLine(Commands.Polar),
	AlgoPolygon(Commands.Polygon),
	AlgoPolygonRegular(Commands.Polygon),
	AlgoPolygonUnion(Commands.Union),
	AlgoPolygonIntersection(Commands.IntersectRegion),
	AlgoPolynomialFromFunction(Commands.Polynomial),
	AlgoPolynomialFromCoordinates(Commands.Polynomial),
	AlgoRadius(Commands.Radius),
	AlgoRayPointVector(Commands.Ray),
	AlgoRootInterval(Commands.Root),
	AlgoRootNewton(Commands.Root),
	AlgoRootsPolynomial(Commands.Root),
	AlgoRotate(Commands.Rotate),
	AlgoRotatePoint(Commands.Rotate),
	AlgoRotate3DPointOrientation(Commands.Rotate),
	AlgoRotate3DLine(Commands.Rotate),
	AlgoSemicircle(Commands.Semicircle),
	AlgoTangentFunctionNumber(Commands.Tangent),
	AlgoTangentFunctionPoint(Commands.Tangent),
	AlgoTangentLine(Commands.Tangent),
	AlgoTangentPoint(Commands.Tangent),
	AlgoCommonTangents(Commands.Tangent),
	AlgoTranslate(Commands.Translate),
	AlgoTranslateVector(Commands.Translate),
	AlgoUnitVectorLine(Commands.UnitVector),
	AlgoUnitVectorVector(Commands.UnitVector),
	AlgoVector(Commands.Vector),
	AlgoVectorPoint(Commands.Vector),
	AlgoVertex(Commands.Vertex),
	AlgoTangentCurve(Commands.Tangent),
	AlgoCircumferenceConic(Commands.Circumference),
	AlgoRemoveUndefined(Commands.RemoveUndefined),
	AlgoIntersection(Commands.Intersection),
	//AlgoEvalMathPiper(Commands.EvalMathPiper),
	//AlgoToMathPiperString(Commands.ToMathPiperString),
	AlgoConicFromCoeffList(Commands.Conic),
	AlgoPointsFromList(Commands.Point),
	AlgoIntersectLineCubic(Commands.Intersect),
	AlgoIntegralODE(Commands.Locus),
	AlgoPolyLine(Commands.PolyLine),
	AlgoPolyLine3D(Commands.PolyLine),
	AlgoClosestPoint(Commands.ClosestPoint),
	AlgoClosestPoint3D(Commands.ClosestPoint),
	AlgoClosestPointLines3D(Commands.ClosestPoint),
	AlgoClosestPointToRegion3D(Commands.ClosestPoint),
	AlgoPolygon3D(Commands.Polygon),
	//AlgoCoordSys2D(Commands.CoordSys2D),
	AlgoJoinPoints3DSegment(Commands.Segment),
	AlgoJoinPoints3DLine(Commands.Line),
	AlgoJoinPoints3DRay(Commands.Ray),
	AlgoOrthoLinePoint(Commands.OrthogonalLine),
	AlgoOrthoLinePointPlane(Commands.OrthogonalLine),
	AlgoOrthoLinePointVectors(Commands.OrthogonalLine),
	AlgoOrthoLineLineLine(Commands.OrthogonalLine),
	AlgoOrthoLineLinePointPlane(Commands.OrthogonalLine),
	AlgoOrthoVectorPlane(Commands.OrthogonalVector),
	AlgoUnitOrthoVectorPlane(Commands.UnitOrthogonalVector),
	AlgoCircle3DThreePoints(Commands.Circle),
	AlgoCircleAxisPoint(Commands.Circle),
	AlgoCirclePointRadiusDirection(Commands.Circle),
	AlgoCirclePointPointDirection(Commands.Circle),
	AlgoPlane(Commands.Plane),
	AlgoPlaneThroughPoint(Commands.Plane),
	AlgoOrthoPlanePoint(Commands.PerpendicularPlane),
	AlgoPlaneBisector(Commands.PlaneBisector),
	//Algo3Dto2D(Commands.To2D),
	AlgoPoint3DOnPath(Commands.Point),
	AlgoIntersectCoordSys(Commands.Intersect),
	AlgoPointInRegion(Commands.PointIn),
	AlgoPoint3DInRegion(Commands.PointIn),
	AlgoSphere(Commands.Sphere),
	
	//AlgoPolyhedron(Commands.Polyhedron),
	AlgoCube(Commands.Cube),
	AlgoTetrahedron(Commands.Tetrahedron),
	AlgoOctahedron(Commands.Octahedron),
	AlgoDodecahedron(Commands.Dodecahedron),
	AlgoIcosahedron(Commands.Icosahedron),
	
	AlgoIntersectPlanes(Commands.IntersectionPaths),
	AlgoIntersectPlaneQuadric(Commands.IntersectionPaths),
	AlgoConeInfinitePointVectorNumber(Commands.InfiniteCone),
	AlgoConeInfinitePointPointNumber(Commands.InfiniteCone),
	AlgoConeInfinitePointLineAngle(Commands.InfiniteCone),
	AlgoCylinderInfinitePointPointNumber(Commands.InfiniteCylinder),
	AlgoCylinderInfinitePointVectorNumber(Commands.InfiniteCylinder),
	AlgoCylinderInfiniteAxisRadius(Commands.InfiniteCylinder),
	AlgoQuadricSide(Commands.QuadricSide),
	AlgoDependentPlane,AlgoDependentPoint3D,
	AlgoDependentPoint,AlgoDependentList,AlgoDependentImplicitPoly,
	AlgoDependentCasCell,AlgoDependentVector,AlgoDependentText,
	AlgoDependentNumber,AlgoDependentListExpression,
AlgoDependentBoolean,AlgoDependentConic,AlgoDependentFunction,
AlgoDependentFunctionNVar,AlgoDependentInterval,AlgoDependentLine,
AlgoCellRangeExpression,AlgoDependentGeoCopy,AlgoMacro,

AlgoTo2D,AlgoDependentVector3D,AlgoFunctionFreehand,
	AlgoSimpleRootsPoly(Commands.Roots)
	;
	private String command;
	private Algos(){
		this.command="Expression";
	}
	private Algos(Commands command){
		this.command = command.name();
	}
	public String getCommand(){
		return command;
	}
	
}
