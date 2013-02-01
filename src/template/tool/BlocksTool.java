package template.tool;

import processing.app.*;
import processing.app.tools.*;

public class BlocksTool implements Tool {

	@Override
	public String getMenuTitle() {
		// TODO Auto-generated method stub
		return "Blocks";
	}

	@Override
	public void init(Editor arg0) {

	}

	@Override
	public void run() {
		System.out.println("hello Tool. ##name## ##version## by ##author##");		
	}

}
