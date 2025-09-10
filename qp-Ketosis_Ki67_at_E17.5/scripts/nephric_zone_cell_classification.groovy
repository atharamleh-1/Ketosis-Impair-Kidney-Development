
// Find periphery
selectAnnotations();
runPlugin('qupath.lib.plugins.objects.DilateAnnotationPlugin', '{"radiusMicrons":-100.0,"lineCap":"ROUND","removeInterior":true,"constrainToParent":true}')
clearSelectedObjects(true);
clearSelectedObjects();

// Cell detection
selectAnnotations();
runPlugin('qupath.imagej.detect.cells.WatershedCellDetection', '{"detectionImage":"Cy3","requestedPixelSizeMicrons":0.5,"backgroundRadiusMicrons":8.0,"backgroundByReconstruction":true,"medianRadiusMicrons":0.0,"sigmaMicrons":1.5,"minAreaMicrons":10.0,"maxAreaMicrons":400.0,"threshold":200.0,"watershedPostProcess":true,"cellExpansionMicrons":5.0,"includeNuclei":true,"smoothBoundaries":true,"makeMeasurements":true}')
// Cell Classification
runObjectClassifier("Ki67-Six2 double ");