package ${PACKAGE_NAME};

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by eugene .
 */

public class ${NAME} extends RecyclerView.Adapter<${NAME}.ViewHolder> {

    List<String> data;
    Context context;

    public ${NAME}(Context context, List<String> data) {
        this.data = data;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        Context context;
        public ViewHolder(View view, Context context) {
            super(view);
            this.context = context;
            ButterKnife.bind(this, view);

        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position, List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_records, parent, false), context);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }
}

