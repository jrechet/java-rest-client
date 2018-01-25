package poe.rest.client.to;


import java.util.List;

public class UserTO {
    String email;

    String password;

    List<TrackTO> tracks;

    long id;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TrackTO> getTracks() {
        return tracks;
    }

    public void setTracks(List<TrackTO> tracks) {
        this.tracks = tracks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
