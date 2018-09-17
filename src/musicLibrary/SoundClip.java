package musicLibrary;

/**
 * SoundClip is a class representing a digital
 * sound clip file on disk.
 */

import java.io.File;

public class SoundClip extends Album{

		private final File file;
	    private String name;
	    private String artist;
		
		/**
		 * Make a SoundClip from a file.
		 * Requires file != null.
		 */
		public SoundClip(File file) {
			assert file != null;
			this.file = file;
		}

	    // Setting song name
	    public void setName(String name) {
	        this.name = name;
	    }
	    // Setting artist name
	    public void setArtist(String artistName) {
	        this.artist = artistName;
	    }

	    // Getting song name
	    public String getName() {
	        return name;
	    }

	    // Getting artist name
	    public String getArtistName() {
	        return artist;
	    }
		/**
		 * @return the file containing this sound clip.
		 */
		public File getFile() {
			return file;
		}
		
		public String toString(){
			return file.getName();
		}
		
		@Override
		public boolean equals(Object obj) {
			return 
				obj instanceof SoundClip
				&& ((SoundClip)obj).file.equals(file);
		}
		
		@Override
		public int hashCode() {
			return file.hashCode();
		}


}
