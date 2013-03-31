/**
 *
 * ##description##
 *
 * ##copyright## ##author##
 *
 * ##license## *
 * 
 * @author		##author##
 * @modified	##date##
 * @version		##version##
 *
 */

package bitcraftlab.blocks.tool;

import edu.mit.blocks.controller.WorkspaceController;
import processing.app.*;
import processing.app.tools.*;


 public class BlocksTool implements Tool {
 
	public String getMenuTitle() {
		return "Blocks";
	}
 
	public void init(Editor theEditor) {
	}
	
	// entry point for running the tool in standalone mode ...
	public static void main(String[] args) {
		System.out.println("Running in standalone mode");
		String[] defaults = { "data/lang_def.xml" };
		launch(defaults);
	}
 
	public void run() {
		
		// TODO: 
		// Create our own custom workspace controller 
		// so we can load language definition from the data folder
		// hidden inside the jar
		
		String[] args = { "data/lang_def.xml" };
		launch(args);
	}
	
	public static void launch(String[] args) {
		System.out.println("Let's snap blocks together. ##name## ##version## by ##author##");
		WorkspaceController.main(args);
	}
 
 }



