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
 
	public void run() {
		System.out.println("Let's snap blocks together. ##name## ##version## by ##author##");
		
		String[] args = new String[1];
		args[0] = new String("/data/lang_def.xml");
		WorkspaceController.main(args);
		
	}
 
 }



