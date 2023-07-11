package com.example.project2_todolistapp

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.project2_todolistapp.databinding.TodoListitemBinding
import com.example.project2_todolistapp.db.Todo

class TodoListViewHolder(
    private val itemBinding: TodoListitemBinding): RecyclerView.ViewHolder(itemBinding.root) {
    fun bindData(todo: Todo){
        itemBinding.ItemTodoCB.isChecked = todo.isDone
        itemBinding.ItemToDodate.text = todo.date
        itemBinding.ItemTodoDec.text  = todo.desc
        itemBinding.ItemTodoTitle.text = todo.title
    }
}

class TodoListAdapter(
    private val listofTodos: MutableList<Todo>
): RecyclerView.Adapter<TodoListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        return TodoListViewHolder(
            TodoListitemBinding.inflate(
                LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount() = listofTodos.size

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
            holder.bindData(listofTodos[position])
    }
}

interface TodoStateChangedListener{
    fun onCheckStateChanged(position: Int)
}