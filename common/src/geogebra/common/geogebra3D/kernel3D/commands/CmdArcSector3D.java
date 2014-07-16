package geogebra.common.geogebra3D.kernel3D.commands;

import geogebra.common.geogebra3D.kernel3D.algos.AlgoConicPartConicParameters3D;
import geogebra.common.geogebra3D.kernel3D.algos.AlgoConicPartConicPoints3D;
import geogebra.common.kernel.Kernel;
import geogebra.common.kernel.commands.CmdArcSector;
import geogebra.common.kernel.geos.GeoElement;
import geogebra.common.kernel.geos.GeoNumberValue;
import geogebra.common.kernel.kernelND.GeoConicND;
import geogebra.common.kernel.kernelND.GeoPointND;

public class CmdArcSector3D extends CmdArcSector {
	
	
	
	
	public CmdArcSector3D(Kernel kernel, int type) {
		super(kernel, type);
	}


	@Override
	protected GeoElement arcSector(String label, GeoConicND conic, GeoNumberValue start, GeoNumberValue end){
		
		if (conic.isGeoElement3D()){
			AlgoConicPartConicParameters3D algo = new AlgoConicPartConicParameters3D(
					cons, label, conic, start, end, type);

			return algo.getConicPart();
		}
		

		return super.arcSector(label, conic, start, end);
	}
	
	@Override
	protected GeoElement arcSector(String label, GeoConicND conic, GeoPointND start, GeoPointND end){
		
		if (conic.isGeoElement3D() || start.isGeoElement3D() || end.isGeoElement3D()){
			AlgoConicPartConicPoints3D algo = new AlgoConicPartConicPoints3D(
					cons, label, conic, start, end, type);

			return algo.getConicPart();
		}
		

		return super.arcSector(label, conic, start, end);
	}
}
