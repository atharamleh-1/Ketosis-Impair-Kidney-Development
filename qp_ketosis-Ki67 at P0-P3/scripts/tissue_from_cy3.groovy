setImageType('FLUORESCENCE');
setChannelNames(
     'DAPI',
     'Cy3',
     'Cy5',
)
clearAnnotations();
resetSelection();
createAnnotationsFromPixelClassifier("tissue2_300", 100000.0, 100000.0)
selectAnnotations();
