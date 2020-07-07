package etu.leti.parser;

import com.google.gson.Gson;

import java.io.*;

import etu.leti.field.*;

public class MapParser {

    private File jsonFile;
    private final Gson gson;

    public MapParser() {
        gson = new Gson();
    }

    public File getJsonFile() {
        return jsonFile;
    }

    public void setJsonFile(File jsonFile) {
        this.jsonFile = jsonFile;
    }

    public Cell[] parseCellArr() throws IOException {
        if(jsonFile == null) {
            throw new FileNotFoundException("No json file was choose");
        }

        BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
        StringBuilder userJson = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            userJson.append(line);
        }
        reader.close();

        return gson.fromJson(userJson.toString(), Cell[].class);
    }
}
