/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terje;

import java.io.File;

/**
 *
 * @author Djconejoloco
 */
public class Terje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal P =new Principal();
        P.setVisible(true);
        
        // TODO code application logic here
    }

















/*

lasheight -i tiles_ground\tile*.laz -drop_below -5 -drop_above 100 -classify_between 0.5 1.5 3 -classify_between 1.5 3 4 -classify_between 3 100 5 -odir tiles_class -olaz -cores 2
cd tiles_ground
for %%f in (tile_*.laz) do if not exist ..\tiles_class\%%f copy %%f ..\tiles_class\%%f
cd ..
del /q tiles_ground\tile*.laz

:: classify buildings and trees: step 4 since we have less than 2 points/sq meter!
mkdir tiles_classified
lasclassify -i tiles_class\tile*.laz -step 4 -odir tiles_classified -olaz -cores 2
cd tiles_class
for %%f in (tile_*.laz) do if not exist ..\tiles_classified\%%f copy %%f ..\tiles_classified\%%f
cd ..
del /q tiles_class\tile*.laz

:: At this point we are ready to generate contour lines in DXF format for easy OCAD import

:tiles_generated
echo Classified tiles generated, ready to generate contours, slope/cliff/dem and vegetation
pause

:: Generate contours.dxf & contours.crt for ocad import. Picks output name from current directory
gen-dxf-iso-dep.pl -cores 7 -force -contour_intervals 25,5,2.5 tiles_classified\tile*.laz

:: Generate Digital Elevation Model in .ASC format as well as slope and cliff images
:: All the output files will be named starting with the name of the current directory
rem gen-slope-asc.pl -cores 7 -force tiles_classified\tile*.laz

:: Generate vegetation model
gen-veg-multi.pl -cores 7 -force tiles_classified\tile*.laz

:: Convert vegetation to vector data
File fil = new File("veg2dxf.pl -cores 7 tiles_classified\tile*.gif");

:: Para convertir vegetacion en dxf
mergedxf.pl
*/
  
    
}
