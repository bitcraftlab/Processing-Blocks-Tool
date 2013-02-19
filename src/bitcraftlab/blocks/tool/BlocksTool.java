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
 
import java.io.File;

import edu.mit.blocks.controller.WorkspaceController;
import processing.app.*;
import processing.app.tools.*;


 public class BlocksTool implements Tool {
 
	public String getMenuTitle() {
		return "Blocks";
	}
 
	public void init(Editor theEditor) {
	}
 
	public void run() {
		System.out.println("Let's snap blocks together. ##name## ##version## by ##author##");
		
		String[] args = new String[1];
		// TODO: how the heck do we pass in the right relative path for it to load from the data folder?
		args[0] = "C:/Users/josh/workspace/Processing-Blocks-Tool/data/lang_def.xml";
		System.out.println(args[0]);
		WorkspaceController.main(args);
		
	}
 
 }



