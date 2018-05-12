package at.wifi.swdev.mycontacts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class UserAdapter extends RecyclerView.Adapter<UserAdapter.Viewholder> {
    List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }


    @Override
    public UserAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(UserAdapter.Viewholder holder, int position) {
        holder.firstname.setText(users.get(position).getFirstname());
        holder.lastname.setText(users.get(position).getLastname());
        holder.email.setText(users.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public TextView firstname;
        public TextView lastname;
        public TextView email;

        public Viewholder(View itemView) {
            super(itemView);
            firstname = itemView.findViewById(R.id.first_name);
            lastname = itemView.findViewById(R.id.last_name);
            email = itemView.findViewById(R.id.email);
        }
    }
}
