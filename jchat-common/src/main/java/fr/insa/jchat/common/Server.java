package fr.insa.jchat.common;

import java.io.File;
import java.net.Inet4Address;
import java.util.UUID;

public class Server {
    private UUID uuid;

    private String name;

    private File image;

    private String description;

    private int port;

    public Server(UUID uuid, String name, File image, String description, int port) {
        this.uuid = uuid;
        this.name = name;
        this.image = image;
        this.description = description;
        this.port = port;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public Server setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Server setName(String name) {
        this.name = name;
        return this;
    }

    public File getImage() {
        return this.image;
    }

    public Server setImage(File image) {
        this.image = image;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Server setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getPort() {
        return this.port;
    }

    public Server setPort(int port) {
        this.port = port;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;

        Server server = (Server)o;

        return uuid.equals(server.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public String toString() {
        return "Server{" + "uuid=" + uuid + ", name='" + name + '\'' + ", image=" + image + ", description='" + description + '\'' + ", port=" + port + '}';
    }
}
