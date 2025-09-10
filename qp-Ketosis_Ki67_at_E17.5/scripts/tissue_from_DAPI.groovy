setImageType('FLUORESCENCE');
setChannelNames(
     'DAPI',
     'Cy3',
     'Cy5',
)
clearAnnotations();
resetSelection();
createAnnotationsFromPixelClassifier("Tissue 1000", 100000.0, 100000.0, "SELECT_NEW")
selectAnnotations();
